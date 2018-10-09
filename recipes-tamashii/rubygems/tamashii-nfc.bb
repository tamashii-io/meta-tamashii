# Copyright (C) 2018 蒼時弦也 <contact@frost.tw>
# Released under the MIT license (see COPYING.MIT for the terms)

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://README.md;md5=82f692763cbdc66ff2bcad103f3230f6"

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
