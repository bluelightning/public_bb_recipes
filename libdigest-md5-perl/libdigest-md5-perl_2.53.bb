SUMMARY = "Digest::MD5 - Perl interface to the MD5 Algorithm"
AUTHOR = "Gisle Aas <gisle@activestate.com>"
HOMEPAGE = "https://metacpan.org/module/Digest::MD5"
SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0+"
LIC_FILES_CHKSUM = "file://README;md5=2f93400875dbb56f36691d5f69f3eba5"

SRC_URI = "http://cpan.metacpan.org/authors/id/G/GA/GAAS/Digest-MD5-${PV}.tar.gz"
SRC_URI[md5sum] = "affc629d05c4c7b3efe4b3b874bce528"
SRC_URI[sha256sum] = "cde667c0c0c8a4d819d332ba9a4cad7e9f75fc7cabd490aae405ce7bc54d5152"

S = "${WORKDIR}/Digest-MD5-${PV}"

inherit cpan

RDEPENDS_${PN} += "libdigest-base-perl"

BBCLASSEXTEND = "native"
