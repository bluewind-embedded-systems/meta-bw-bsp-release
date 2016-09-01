# Copyright (C) 2016 Bluewind srl
# Released under the MIT license (see COPYING.MIT for the terms)

SUMMARY = "Linux Kernel provided and supported by Bluewind"
DESCRIPTION = "Linux Kernel provided and supported by Bluewind with focus on \
i.MX6UL ViggenTwo Board."

require recipes-kernel/linux/linux-imx.inc
require recipes-kernel/linux/linux-dtb.inc

DEPENDS += "lzop-native bc-native"

SRCBRANCH = "imx_4.1.15_1.0.0_ga_viggentwo"
LOCALVERSION = "-1.2.0"
SRCREV = "9c3dd427582cd294bccf7365df05cf596efa4b0d"
KERNEL_SRC ?= "git://github.com/bluewind-embedded-systems/linux-2.6-imx.git;protocol=git"
SRC_URI = "${KERNEL_SRC};branch=${SRCBRANCH}"

DEFAULT_PREFERENCE = "1"

addtask copy_defconfig after do_unpack before do_configure
do_copy_defconfig () {
    # copy latest imx_v7_defconfig to use
    cp ${S}/arch/arm/configs/imx_v7_defconfig ${B}/.config
    cp ${S}/arch/arm/configs/imx_v7_defconfig ${B}/../defconfig
}

COMPATIBLE_MACHINE = "(mx6|mx6ul|mx7)"
