# Copyright (C) 2018 蒼時弦也 <contact@frost.tw>
# Released under the MIT license (see COPYING.MIT for the terms)

LICENSE = "GPL3"
LIC_FILES_CHKSUM = "file://i2c.gemspec;md5=21bc957abd58360b263194cdcea2572e"

PR = "r0"

BPV = "0.4.2"
PV = "${BPV}"
SRCREV = "ee146fc787212b15dd955d635ed1a7822916f873"

S = "${WORKDIR}/git"

SRC_URI = " \
    git://github.com/andec/i2c.git \
    "

inherit rubygems

BBCLASSEXTEND = "native"
