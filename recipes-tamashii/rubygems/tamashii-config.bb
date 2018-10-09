# Copyright (C) 2018 蒼時弦也 <contact@frost.tw>
# Released under the MIT license (see COPYING.MIT for the terms)

LICENSE = "APACHE"
LIC_FILES_CHKSUM = "file://LICENSE;md5=2b42edef8fa55315f34f2370b4715ca9"

PR = "r0"

BPV = "0.2.0"
PV = "${BPV}"
SRCREV = "74c51d8cc4dbf818c5070d98288232ff4c520932"

S = "${WORKDIR}/git"

SRC_URI = " \
    git://github.com/tamashii-io/tamashii-config.git \
    "

inherit rubygems

BBCLASSEXTEND = "native"

RDEPENDS_${PN} += " \
    tamashii-hookable \
"
