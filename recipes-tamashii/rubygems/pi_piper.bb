# Copyright (C) 2018 蒼時弦也 <contact@frost.tw>
# Released under the MIT license (see COPYING.MIT for the terms)

LICENSE = "BSD2"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=f507d4fa294f68af390d6ae59f0f7c8e"

PR = "r0"

BPV = "2.0.0"
PV = "${BPV}"
SRCREV = "c61900111604861d2b740173eadc385fb13df40c"

S = "${WORKDIR}/git"

SRC_URI = " \
    git://github.com/jwhitehorn/pi_piper.git \
    "

inherit rubygems

BBCLASSEXTEND = "native"

RDEPENDS_${PN} += " \
    ffi \
    eventmachine \
"
