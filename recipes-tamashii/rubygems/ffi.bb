# Copyright (C) 2018 蒼時弦也 <contact@frost.tw>
# Released under the MIT license (see COPYING.MIT for the terms)

# TODO: Check LICENSE type
LICENSE = "BSD2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=dbb5a1cdfebf034d294baebfa68f56b5"

PR = "r0"

BPV = "1.9.6"
PV = "${BPV}"
SRCREV = "0ac1642961c7771e18fdb8aeb1a9faec56397d4a"

S = "${WORKDIR}/git"

SRC_URI = " \
     git://github.com/ffi/ffi.git\
    "

inherit rubygems

BBCLASSEXTEND = "native"

do_configure[depends] += "libffi:do_populate_sysroot"
do_configure[depends] += "libffi-native:do_populate_sysroot"

DEPEND_${PN} += " \
    libffi-native \
"

RDEPEND_${PN} += " \
    libffi \
"
