SUMMARY = "HTTP::Date - date conversion routines"
AUTHOR = "Gisle Aas <gisle@ActiveState.com>"
HOMEPAGE = "https://metacpan.org/module/HTTP::Date"
SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0+"
LIC_FILES_CHKSUM = "file://README;md5=d8b56fd597b38e02b8c55ba366d8226b"

SRC_URI = "http://cpan.metacpan.org/authors/id/G/GA/GAAS/HTTP-Date-6.02.tar.gz"
SRC_URI[md5sum] = "52b7a0d5982d61be1edb217751d7daba"
SRC_URI[sha256sum] = "e8b9941da0f9f0c9c01068401a5e81341f0e3707d1c754f8e11f42a7e629e333"

S = "${WORKDIR}/HTTP-Date-${PV}"

inherit cpan

RDEPENDS_${PN} += "libtime-local-perl"

BBCLASSEXTEND = "native"
