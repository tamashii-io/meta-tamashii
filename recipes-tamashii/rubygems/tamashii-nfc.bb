# Copyright (C) 2018 蒼時弦也 <contact@frost.tw>
# Released under the MIT license (see COPYING.MIT for the terms)

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://README.rdoc;md5=82f692763cbdc66ff2bcad103f3230f6"

PR = "r0"

BPV = "3.1.2"
PV = "${BPV}"
SRCREV = "1d8a113dc27b9b5887640df399a3323656c132c8"

S = "${WORKDIR}/git"

SRC_URI = " \
    git://github.com/tamashii-io/nfc.git \
    file://git/tamashii-nfc.gemspec \
    "

inherit rubygems

BBCLASSEXTEND = "native"

do_configure[depends] += "libnfc:do_populate_sysroot"
do_configure[depends] += "libnfc-native:do_populate_sysroot"

DEPENDS_${PN} += " \
    libnfc-native \
"

RDEPENDS_${PN} += " \
    libnfc \
"
