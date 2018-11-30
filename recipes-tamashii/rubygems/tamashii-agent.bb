# Copyright (C) 2018 蒼時弦也 <contact@frost.tw>
# Released under the MIT license (see COPYING.MIT for the terms)

LICENSE = "APACHE"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=e3fc50a88d0a364313df4b21ef20c29e"

PR = "r0"

BPV = "0.4.0"
PV = "${BPV}"
SRCREV = "80f737100d8413e59db215a4a9ad84dcb896ceab"

S = "${WORKDIR}/git"

SRC_URI = " \
    git://github.com/tamashii-io/tamashii-agent.git \
    file://agent.rb \
    file://tamashii-agent.service \
    "

FILES_${PN} += " \
    ${sysconfdir}/tamashii \
"

inherit rubygems systemd

SYSTEMD_PACKAGES = "tamashii-agent"
SYSTEMD_SERVICE_${PN} = "tamashii-agent.service"
SYSTEMD_AUTO_ENABLE_${PN} = "enable"

do_install_append() {
    install -d ${D}${sysconfdir}/tamashii
    sed -i -e 's#[@]TAMASHII_AGENT_TOKEN[@]#${TAMASHII_AGENT_TOKEN}#' ${WORKDIR}/agent.rb
    sed -i -e 's#[@]TAMASHII_AGENT_HOST[@]#${TAMASHII_AGENT_HOST}#' ${WORKDIR}/agent.rb
    install -m 0644 ${WORKDIR}/agent.rb ${D}${sysconfdir}/tamashii

    install -d ${D}${systemd_system_unitdir}
    install -m 0644 ${WORKDIR}/tamashii-agent.service ${D}${systemd_system_unitdir}
}

BBCLASSEXTEND = "native"

RDEPENDS_${PN} += " \
     tamashii-common \
     tamashii-client \
     tamashii-config \
     tamashii-hookable \
     websocket-driver \
     nio4r \
     pi-piper \
     tamashii-mfrc522 \
     tamashii-nfc \
     i2c \
     aasm \
     concurrent-ruby \
"

REQUIRED_DISTRO_FEATURES= "systemd"
