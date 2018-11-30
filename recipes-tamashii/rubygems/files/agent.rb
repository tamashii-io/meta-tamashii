Tamashii::Agent.config do |config|
  config.auth_type :token
  config.token = "@TAMASHII_AGENT_TOKEN@"
  Tamashii::Client.config.use_ssl = true
  Tamashii::Client.config.host = "@TAMASHII_AGENT_HOST"
  Tamashii::Client.config.port = 443
  Tamashii::Client.config.entry_point = "/tamashii"
  config.connection_timeout = 5
  config.log_file "/var/log/tamashii-agent.log"
end
