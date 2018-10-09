# Copyright (C) 2018 蒼時弦也 <contact@frost.tw>
# Released under the MIT license (see COPYING.MIT for the terms)

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4e6dcfaf544118f10b776fd45ecb52a"

PR = "r0"

BPV = "5.0.1"
PV = "${BPV}"
SRCREV = "b93bd80c3c8ac671c60760dd8a46d2a25ac860b8"

S = "${WORKDIR}/git"

SRC_URI = " \
    git://github.com/aasm/aasm.git \
    "

inherit rubygems

BBCLASSEXTEND = "native"

RDEPENDS_${PN} += " \
    concurrent-ruby \
"
