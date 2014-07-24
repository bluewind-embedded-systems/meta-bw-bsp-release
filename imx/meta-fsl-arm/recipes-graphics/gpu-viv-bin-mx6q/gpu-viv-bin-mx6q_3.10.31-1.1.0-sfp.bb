# Copyright (C) 2013, 2014 Freescale Semiconductor
# Released under the MIT license (see COPYING.MIT for the terms)

require gpu-viv-bin-mx6q.inc

SRC_URI = "${FSL_MIRROR}/${PN}-3.10.31-1.1.0-beta-sfp.bin;fsl-eula=true \
           file://egl.pc \
           file://egl_x11.pc \
           file://glesv1_cm.pc \
           file://glesv1_cm_x11.pc \
           file://glesv2.pc \
           file://glesv2_x11.pc \
           file://vg.pc \
           file://vg_x11.pc \
           file://gc_wayland_protocol.pc \
           file://wayland-egl.pc \
           file://wayland-viv.pc \
           file://directfbrc \
           file://Vivante.icd \
          "

S="${WORKDIR}/${PN}-3.10.31-1.1.0-beta-sfp"

SRC_URI[md5sum] = "f66a40fb49a75ad45c75984f7f2d3acf"
SRC_URI[sha256sum] = "d46a114234fa0a3fea8e866cc54dd1cbd329fd45bd2ea43c9629cafd5877c36b"

# FIXME skip the QA error for viv-samples
INSANE_SKIP_${PN} += "rpaths"

#RDEPENDS_libgl-mx6-dev += "libgl-mesa-dev"

PACKAGE_FP_TYPE = "softfp"