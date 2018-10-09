# Copyright (C) 2018 蒼時弦也 <contact@frost.tw>
# Released under the MIT license (see COPYING.MIT for the terms)

LICENSE = "GPL2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=270149a18e664d261350cfe727055898"

PR = "r0"

BPV = "1.0.9"
PV = "${BPV}"
SRCREV = "e0cf60f76e29d5a4ff5adda34e725214ed4e0a32"

S = "${WORKDIR}/git"

SRC_URI = " \
     git://github.com/eventmachine/eventmachine.git \
    "

inherit rubygems

BBCLASSEXTEND = "native"
