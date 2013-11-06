SUMMARY = "WWW::RobotRules - database of robots.txt-derived permissions"
AUTHOR = "Gisle Aas <gisle@activestate.com>"
HOMEPAGE = "https://metacpan.org/module/WWW::RobotRules"
SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0+"
LIC_FILES_CHKSUM = "file://README;md5=7f068e85f52f7879961c99f0cbeb0e41"

SRC_URI = "http://cpan.metacpan.org/authors/id/G/GA/GAAS/WWW-RobotRules-6.02.tar.gz"
SRC_URI[md5sum] = "b7186e8b8b3701e70c22abf430742403"
SRC_URI[sha256sum] = "46b502e7a288d559429891eeb5d979461dd3ecc6a5c491ead85d165b6e03a51e"

S = "${WORKDIR}/WWW-RobotRules-${PV}"

RDEPENDS_${PN} += "liburi-perl"

inherit cpan

BBCLASSEXTEND = "native"
