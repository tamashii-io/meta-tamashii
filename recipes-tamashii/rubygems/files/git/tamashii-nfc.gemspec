# -*- encoding: utf-8 -*-
# stub: nfc 3.1.2.20181010031156 ruby lib
# stub: ext/nfc/extconf.rb

Gem::Specification.new do |s|
  s.name = "tamashii-nfc".freeze
  s.version = "3.1.2.20181010031156"

  s.required_rubygems_version = Gem::Requirement.new(">= 0".freeze) if s.respond_to? :required_rubygems_version=
  s.require_paths = ["lib".freeze]
  s.authors = ["Aaron Patterson".freeze]
  s.date = "2018-10-09"
  s.description = "NFC is a ruby wrapper for the Near Field Communication library.  The Near\nField Communication library works with many USB RFID readers, so this gem\nlets you read RFID tags.".freeze
  s.email = ["aaron@tenderlovemaking.com".freeze]
  s.executables = ["nfc".freeze]
  s.extensions = ["ext/nfc/extconf.rb".freeze]
  s.extra_rdoc_files = ["CHANGELOG.rdoc".freeze, "Manifest.txt".freeze, "README.rdoc".freeze, "CHANGELOG.rdoc".freeze, "README.rdoc".freeze]
  s.files = [".autotest".freeze, "CHANGELOG.rdoc".freeze, "Manifest.txt".freeze, "README.rdoc".freeze, "Rakefile".freeze, "bin/nfc".freeze, "ext/nfc/context.c".freeze, "ext/nfc/extconf.rb".freeze, "ext/nfc/nfc.c".freeze, "ext/nfc/nfc.h".freeze, "ext/nfc/nfc_device.c".freeze, "ext/nfc/nfc_felica.c".freeze, "ext/nfc/nfc_iso14443a.c".freeze, "lib/nfc.rb".freeze, "lib/nfc/device.rb".freeze, "lib/nfc/felica.rb".freeze, "lib/nfc/iso14443a.rb".freeze, "test/test_context.rb".freeze, "test/test_device.rb".freeze]
  s.homepage = "http://seattlerb.rubyforge.org".freeze
  s.licenses = ["MIT".freeze]
  s.rdoc_options = ["--main".freeze, "README.rdoc".freeze]
  s.rubygems_version = "2.7.6".freeze
  s.summary = "NFC is a ruby wrapper for the Near Field Communication library".freeze

  if s.respond_to? :specification_version then
    s.specification_version = 4

    if Gem::Version.new(Gem::VERSION) >= Gem::Version.new('1.2.0') then
      s.add_development_dependency(%q<minitest>.freeze, ["~> 5.11"])
      s.add_development_dependency(%q<rdoc>.freeze, ["< 7", ">= 4.0"])
      s.add_development_dependency(%q<hoe>.freeze, ["~> 3.17"])
    else
      s.add_dependency(%q<minitest>.freeze, ["~> 5.11"])
      s.add_dependency(%q<rdoc>.freeze, ["< 7", ">= 4.0"])
      s.add_dependency(%q<hoe>.freeze, ["~> 3.17"])
    end
  else
    s.add_dependency(%q<minitest>.freeze, ["~> 5.11"])
    s.add_dependency(%q<rdoc>.freeze, ["< 7", ">= 4.0"])
    s.add_dependency(%q<hoe>.freeze, ["~> 3.17"])
  end
end
