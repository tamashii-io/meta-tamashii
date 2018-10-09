# Copyright (C) 2018 蒼時弦也 <contact@frost.tw>
# Released under the MIT license (see COPYING.MIT for the terms)

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=fde65ae93d18826f70c6fe125aa04297"

PR = "r0"

BPV = "1.0.5"
PV = "${BPV}"
SRCREV = "48b5680c0bc103e036cbcb08da7c612dd35ce677"

S = "${WORKDIR}/git"

SRC_URI = " \
    git://github.com/ruby-concurrency/concurrent-ruby.git \
    "

inherit rubygems

BBCLASSEXTEND = "native"
