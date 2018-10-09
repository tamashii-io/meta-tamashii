LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=3a5ada2f9da3cc94e2bf853f7f0a3ba6"

PR = "r0"

BPV = "0.7.0"
PV = "${BPV}"
SRCREV = "12d2aa8a80fcae4414276675245021a55b58871a"

S = "${WORKDIR}/git"

SRC_URI = " \
    git://github.com/faye/websocket-driver-ruby.git \
    "

inherit ruby

BBCLASSEXTEND = "native"

RDEPENDS_${PN} += " \
    websocket-extensions \
"


