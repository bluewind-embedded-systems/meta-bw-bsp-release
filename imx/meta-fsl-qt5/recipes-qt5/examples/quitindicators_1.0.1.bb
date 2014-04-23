SUMMARY = "QT5 QUItIndicators"
DESCRIPTION = "QUItIndicators components with few usage examples"
HOMEPAGE = "http://quitcoding.com/?page=work#cinex"
LICENSE = "CC-BY-3.0"
LIC_FILES_CHKSUM = "file://README;beginline=38;endline=45;md5=9a4a88358260db32391eda6ebe7562e5"

SRC_URI = "http://quitcoding.com/download/QUItIndicators_1.0.1.tar.gz"

SRC_URI[md5sum] = "85ec60b553e181c55b331a9921d1b9a0"
SRC_URI[sha256sum] = "db84112adbde9b6f28c129e8fb37a6912f4bc34bed18e57f570fb78ea0cb6ae2"

S = "${WORKDIR}/QUItIndicators_1.0.1"

DEPENDS = "qtdeclarative qtgraphicaleffects"
RDEPENDS_${PN} = "qtdeclarative-qmlplugins qtgraphicaleffects-qmlplugins"

require recipes-qt/qt5/qt5.inc

do_install() {
    install -d ${D}${datadir}/${P}
    install -m 0755 ${B}/QUItIndicators ${D}${datadir}/${P}  
    cp -a ${S}/qml ${D}${datadir}/${P}  
}

FILES_${PN}-dbg += "${datadir}/${P}/.debug"
FILES_${PN} += "${datadir}"