# Copyright (C) 2016 Bluewind srl

DESCRIPTION = "U-Boot provided by Bluewind with focus on i.MX6UL ViggenTwo boards."
require recipes-bsp/u-boot/u-boot.inc

PROVIDES += "u-boot"

LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://Licenses/gpl-2.0.txt;md5=b234ee4d69f5fce4486a80fdaf4a4263"

SRCBRANCH = "imx_v2015.04_4.1.15_1.0.0_ga_viggentwo"
UBOOT_SRC ?= "git://github.com/bluewind-embedded-systems/uboot-imx.git;protocol=git"
SRC_URI = "${UBOOT_SRC};branch=${SRCBRANCH}"
SRCREV = "57d33c7c400322239940702d271497bfddb91cc9"

S = "${WORKDIR}/git"

inherit fsl-u-boot-localversion

LOCALVERSION ?= "imx_v2015.04_4.1.15_1.2.0_ga"

PACKAGE_ARCH = "${MACHINE_ARCH}"
COMPATIBLE_MACHINE = "(mx6|mx6ul|mx7)"
