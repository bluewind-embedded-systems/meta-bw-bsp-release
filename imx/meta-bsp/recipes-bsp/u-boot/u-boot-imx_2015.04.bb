# Copyright (C) 2016 Bluewind srl

DESCRIPTION = "U-Boot provided by Bluewind with focus on i.MX6UL ViggenTwo boards."
require recipes-bsp/u-boot/u-boot.inc

PROVIDES += "u-boot"

LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://Licenses/gpl-2.0.txt;md5=b234ee4d69f5fce4486a80fdaf4a4263"

SRCBRANCH = "imx_v2015.04_4.1.15_1.0.0_ga_viggentwo"
UBOOT_SRC ?= "https://github.com/bluewind-embedded-systems/uboot-imx.git"
SRC_URI = "${UBOOT_SRC};branch=${SRCBRANCH}"
SRCREV = "34f02abfb2ebb88b1c4d73ed93324c9df733d26b"

S = "${WORKDIR}/git"

inherit fsl-u-boot-localversion

LOCALVERSION ?= "-${SRCBRANCH}"

PACKAGE_ARCH = "${MACHINE_ARCH}"
COMPATIBLE_MACHINE = "(mx6|mx6ul|mx7)"
