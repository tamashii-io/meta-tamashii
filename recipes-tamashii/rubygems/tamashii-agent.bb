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
    "

inherit rubygems

BBCLASSEXTEND = "native"

RDEPENDS_${PN} += " \
     tamashii-common \
     tamashii-client \
     tamashii-config \
     tamashii-hookable \
     websocket-driver \
     nio4r \
     pi_piper \
     tamashii-mfrc522 \
     tamashii-nfc \
     i2c \
     aasm \
     concurrent-ruby" \
"
