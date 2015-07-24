require conf/distro/poky.conf

# This is the default distro configuration.

# Add the ability to specify _imx machines (temporarily here)
MACHINEOVERRIDES =. "imx:"

# Comment out the 2 lines below to use bluez4.
DISTRO_FEATURES_append_mx6 = " bluez5"
DISTRO_FEATURES_append_mx7 = " bluez5"

# Preferred Providers
PREFERRED_PROVIDER_u-boot_mx5 = "u-boot-fslc"
PREFERRED_PROVIDER_u-boot_mx6 = "u-boot-imx"
PREFERRED_PROVIDER_u-boot_mx7 = "u-boot-imx"

PREFERRED_PROVIDER_virtual/kernel_mx6 = "linux-imx"
PREFERRED_PROVIDER_virtual/kernel_mx7 = "linux-imx"

PREFERRED_PROVIDER_virtual/libgal-x11_mx6 = "imx-gpu-viv"
PREFERRED_PROVIDER_virtual/libopenvg_mx6q = "imx-gpu-viv"
PREFERRED_PROVIDER_virtual/libopenvg_mx6dl = "imx-gpu-viv"
PREFERRED_PROVIDER_virtual/libopenvg_mx6sx = "imx-gpu-viv"
PREFERRED_PROVIDER_virtual/libopenvg_mx6sl = "imx-gpu-viv"

# Preferred Versions

# set these because of meta-fsl-arm override to new xorg version
PREFERRED_VERSION_xserver-xorg_mx6q = "2:1.17.2"
PREFERRED_VERSION_xserver-xorg_mx6dl = "2:1.17.2"
PREFERRED_VERSION_xserver-xorg_mx6s = "2:1.17.2"
PREFERRED_VERSION_xserver-xorg_mx6sl = "2:1.17.2"
PREFERRED_VERSION_xserver-xorg_mx6sx = "2:1.17.2"
PREFERRED_VERSION_xserver-xorg_mx6ul = "2:1.17.2"
PREFERRED_VERSION_xserver-xorg_mx7 = "2:1.17.2"

PREFERRED_VERSION_xtrans = "1.3.5"

# preferred versions of recipes-graphics
FP_TAG = "${@base_contains("TUNE_FEATURES", "callconvention-hard", "-hfp", "-sfp", d)}"

PREFERRED_VERSION_imx-gpu-viv = "5.0.11.p7.1${FP_TAG}"
PREFERRED_VERSION_xf86-video-imxfb-vivante = "5.0.11.p7.1"
PREFERRED_VERSION_kernel-module-imx-gpu-viv = "5.0.11.p7.1"

PREFERRED_VERSION_fsl-gpu-sdk_mx6 = "2.2"

# Use Wayland new version
BBMASK = "meta-fsl-arm/recipes-graphics/wayland/weston_%.bbappend"
BBMASK .= "|meta-fsl-arm/recipes-graphics/mesa/mesa_%.bbappend"

# Remove the GST patch on the community
BBMASK .= "|meta-fsl-arm/recipes-multimedia/gstreamer/gstreamer1.0-plugins-base_%.bbappend"
PREFERRED_VERSION_wayland_mx6 = "1.8.1"
PREFERRED_VERSION_weston_mx6 = "1.8.0"
PREFERRED_VERSION_wayland-native = "1.8.1"
PREFERRED_VERSION_libinput_mx6 = "0.11.0"

# Preferred versions of recipes-bsp
PREFERRED_VERSION_imx-vpu_mx5 = "11.09.02"
PREFERRED_VERSION_imx-vpu_mx6 = "5.4.31"
PREFERRED_VERSION_imx-lib_mx5 = "11.09.02"
PREFERRED_VERSION_imx-lib_mx6 = "5.1"
PREFERRED_VERSION_imx-lib_mx7 = "5.1"
PREFERRED_VERSION_imx-test = "5.2"
PREFERRED_VERSION_imx-uuc = "0.5"
PREFERRED_VERSION_imx-kobs = "5.1"
PREFERRED_VERSION_firmware-imx = "5.2"
PREFERRED_VERSION_u-boot-imx_mx6 = "2015.04"
PREFERRED_VERSION_u-boot-imx_mx7 = "2015.04"
PREFERRED_VERSION_u-boot-imx-mfgtool_mx6 = "2015.04"
PREFERRED_VERSION_u-boot-imx-mfgtool_mx7 = "2015.04"

# preferred versions of recipes-kernel
PREFERRED_VERSION_linux-libc-headers = "3.14"
PREFERRED_VERSION_linux-imx_mx6 = "3.14.38"
PREFERRED_VERSION_linux-imx_mx7 = "3.14.38"
PREFERRED_VERSION_mfgtool-linux-imx_mx6 = "3.14.38"
PREFERRED_VERSION_mfgtool-linux-imx_mx7 = "3.14.38"
PREFERRED_VERSION_linux-mfgtool_mx6 = "3.14.38"
PREFERRED_VERSION_linux-imx-mfg_mx6 = "3.14.38"
PREFERRED_VERSION_linux-mfgtool_mx7 = "3.14.38"
PREFERRED_VERSION_linux-imx-mfg_mx7 = "3.14.38"

# preferred versions of recipes-multimedia
PREFERRED_VERSION_gst-fsl-plugin = "4.0.3"
PREFERRED_VERSION_libfslcodec = "4.0.7"
PREFERRED_VERSION_libfslparser = "4.0.7"
PREFERRED_VERSION_libfslvpuwrap = "1.0.58"
PREFERRED_VERSION_gst1.0-fsl-plugin = "4.0.7"
PREFERRED_VERSION_fsl-alsa-plugins = "1.0.25"
PREFERRED_VERSION_gst-plugins-gl = "0.10.3"
PREFERRED_VERSION_fslqtapplications = "1.0.5"

MACHINE_GSTREAMER_1_0_PLUGIN_mx6 = "gst1.0-fsl-plugin"
MACHINE_GSTREAMER_1_0_PLUGIN_mx6q = "gst1.0-fsl-plugin"
MACHINE_GSTREAMER_1_0_PLUGIN_mx6dl = "gst1.0-fsl-plugin"
MACHINE_GSTREAMER_1_0_PLUGIN_mx6sl = "gst1.0-fsl-plugin"
MACHINE_GSTREAMER_1_0_PLUGIN_mx6sx = "gst1.0-fsl-plugin"
MACHINE_GSTREAMER_1_0_PLUGIN_mx7 = "gst1.0-fsl-plugin"

MACHINE_GSTREAMER_PLUGIN_mx6ul = ""
MACHINE_GSTREAMER_PLUGIN_mx6qp = ""
MACHINE_GSTREAMER_PLUGIN_mx7 = ""

DEFAULTTUNE_mx6 ?= "cortexa9hf-neon"
DEFAULTTUNE_mx6ul ?= "cortexa7hf-neon"
DEFAULTTUNE_mx7 ?= "cortexa7hf-neon"

SANITY_TESTED_DISTROS += " \
    Ubuntu-12.04 \n \
"

# Add the ability to specify _imx machines
MACHINEOVERRIDES =. "imx:"