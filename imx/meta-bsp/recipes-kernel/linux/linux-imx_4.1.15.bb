# Copyright (C) 2016 Bluewind srl
# Released under the MIT license (see COPYING.MIT for the terms)

SUMMARY = "Linux Kernel provided and supported by Bluewind"
DESCRIPTION = "Linux Kernel provided and supported by Bluewind with focus on \
i.MX6UL ViggenTwo Board. It includes support for many IPs such as GPU, VPU and IPU."

require recipes-kernel/linux/linux-imx.inc
require recipes-kernel/linux/linux-dtb.inc

DEPENDS += "lzop-native bc-native"

SRCBRANCH = "imx_4.1.15_2.0.0_ga_viggentwo"
LOCALVERSION = "-2.0.0"
SRCREV = "8809b650309cb63b2473819a232f79d53b1ba4d1"
KERNEL_SRC ?= "git://github.com/bluewind-embedded-systems/linux-2.6-imx.git;protocol=git"
SRC_URI = "${KERNEL_SRC};branch=${SRCBRANCH}"

DEFAULT_PREFERENCE = "1"

DO_CONFIG_V7_COPY = "no"
DO_CONFIG_V7_COPY_mx6 = "yes"
DO_CONFIG_V7_COPY_mx6ul = "yes"
DO_CONFIG_V7_COPY_mx7 = "yes"

addtask copy_defconfig after do_patch before do_preconfigure #do_configure
do_copy_defconfig () {
    if [ ${DO_CONFIG_V7_COPY} = "yes" ]; then
        # copy latest imx_v7_defconfig to use for mx6, mx6ul and mx7
        mkdir -p ${B}
        cp ${S}/arch/arm/configs/imx_v7_defconfig ${B}/.config
        cp ${S}/arch/arm/configs/imx_v7_defconfig ${B}/../defconfig
    fi
}

COMPATIBLE_MACHINE = "(mx6|mx6ul|mx7)"
