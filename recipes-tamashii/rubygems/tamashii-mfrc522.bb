# Copyright (C) 2018 蒼時弦也 <contact@frost.tw>
# Released under the MIT license (see COPYING.MIT for the terms)

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c6a546f0d21222e9cfc6ac973d5c1bdd"

PR = "r0"

BPV = "1.0.8"
PV = "${BPV}"
SRCREV = "ef8db230cc8756b1573b1665604732efec90fd21"

S = "${WORKDIR}/git"

SRC_URI = " \
    git://github.com/tamashii-io/MFRC522_Ruby.git \
    "

inherit rubygems

BBCLASSEXTEND = "native"

RDEPENDS_${PN} += " \
    pi_piper \
"
