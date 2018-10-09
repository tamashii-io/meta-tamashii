LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=c0438c8a9a4ba501b1e649bb9fa82c0e"

PR = "r0"

BPV = "0.1.3"
PV = "${BPV}"
SRCREV = "60318127e24f75e0793e4df2432d2fbaf4f035e9"

S = "${WORKDIR}/git"

SRC_URI = " \
    git://github.com/faye/websocket-extensions-ruby.git \
    "

inherit ruby

BBCLASSEXTEND = "native"
