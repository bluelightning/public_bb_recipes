SUMMARY = "Generic configuration parser for multiple formats"
AUTHOR = "Brian Cassidy <bricas@cpan.org>"
HOMEPAGE = "https://metacpan.org/release/Config-Any"
SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0+"
LIC_FILES_CHKSUM = "file://README;md5=05dd8564217532955fcc6798bb276485"

SRC_URI = "http://cpan.metacpan.org/authors/id/B/BR/BRICAS/Config-Any-${PV}.tar.gz"
SRC_URI[md5sum] = "bf58a5cbd8b809886bd0459986e55ad7"
SRC_URI[sha256sum] = "710f8fc8f9414205cb58399bfbb4d9aaf7883f8ce046cee22913f6818795c61a"

S = "${WORKDIR}/Config-Any-${PV}"

inherit cpan

RDEPENDS_${PN} += "libmodule-pluggable-perl"

BBCLASSEXTEND = "native"
