# Copyright (C) 2016 Bluewind srl

DESCRIPTION = "U-Boot provided by Freescale with focus on  i.MX reference boards."
require recipes-bsp/u-boot/u-boot.inc

PROVIDES += "u-boot"

LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://Licenses/gpl-2.0.txt;md5=b234ee4d69f5fce4486a80fdaf4a4263"

SRCBRANCH = "imx_v2016.03_4.1.15_2.0.0_ga_viggentwo"
#UBOOT_SRC ?= "git://github.com/bluewind-embedded-systems/uboot-imx.git;protocol=git"
UBOOT_SRC ?= "git://git@git.bwlocal.it/bluewind/uboot-imx.git;protocol=ssh"
SRC_URI = "${UBOOT_SRC};branch=${SRCBRANCH}"
SRCREV = "25626572166b8cf23188e4cff12ce3251b4329ee"

S = "${WORKDIR}/git"

inherit fsl-u-boot-localversion

LOCALVERSION ?= "-${SRCBRANCH}"

PACKAGE_ARCH = "${MACHINE_ARCH}"
COMPATIBLE_MACHINE = "(mx6|mx6ul|mx7)"
