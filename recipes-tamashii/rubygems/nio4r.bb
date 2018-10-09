LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=6863f71241a2515e27864f676a3a8a84"

PR = "r0"

BPV = "2.3.1"
PV = "${BPV}"
SRCREV = "4a658dd59841dd6f3b2070ece28487dc610b557e"

S = "${WORKDIR}/git"

SRC_URI = " \
    git://github.com/socketry/nio4r.git \
    "

inherit rubygems

BBCLASSEXTEND = "native"
