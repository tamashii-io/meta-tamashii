# Copyright (C) 2018 蒼時弦也 <contact@frost.tw>
# Released under the MIT license (see COPYING.MIT for the terms)

LICENSE = "APACHE"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=e3fc50a88d0a364313df4b21ef20c29e"

PR = "r0"

BPV = "0.2.1"
PV = "${BPV}"
SRCREV = "91c4b816fcd1e62cc54e6b4dfcca239185a1bba6"

S = "${WORKDIR}/git"

SRC_URI = " \
    git://github.com/tamashii-io/tamashii-client.git \
    "

inherit rubygems

BBCLASSEXTEND = "native"

RDEPENDS_${PN} += " \
     tamashii-common \
     tamashii-config \
     nio4r \
     websocket-driver \
     concurrent-ruby \
     logger-colors \
"
