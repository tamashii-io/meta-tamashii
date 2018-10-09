# Copyright (C) 2018 蒼時弦也 <contact@frost.tw>
# Released under the MIT license (see COPYING.MIT for the terms)

LICENSE = "APACHE"
LIC_FILES_CHKSUM = "file://LICENSE;md5=2b42edef8fa55315f34f2370b4715ca9"

PR = "r0"

BPV = "0.1.0"
PV = "${BPV}"
SRCREV = "feb98c75a606adc4dbb38952a662c355ea189061"

S = "${WORKDIR}/git"

SRC_URI = " \
    git://github.com/tamashii-io/tamashii-hookable.git \
    "

inherit rubygems

BBCLASSEXTEND = "native"
