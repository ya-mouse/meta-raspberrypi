
SUMMARY = "Controller Area Network interface module for Python"
HOMEPAGE = "https://github.com/hardbyte/python-can"
AUTHOR = "Brian Thorne <brian@thorne.link>"
LICENSE = "LGPLv3"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=e6a600fd5e1d9cbde2d983680233ad02"

SRC_URI = "https://files.pythonhosted.org/packages/97/dd/5e5ae96db41ba57dde127e0600c3d324239ed692e167296c5fdb992cbf41/python-can-3.3.4.tar.gz"
SRC_URI[md5sum] = "305075968c56bd85130b19d86e9e505d"
SRC_URI[sha256sum] = "2d3c223b7adc4dd46ce258d4a33b7e0dbb6c339e002faa40ee4a69d5fdce9449"

S = "${WORKDIR}/python-can-3.3.4"

RDEPENDS:${PN} = ""

inherit setuptools3
