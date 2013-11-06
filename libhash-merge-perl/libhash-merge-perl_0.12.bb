SUMMARY = "Merges arbitrarily deep hashes into a single hash"
AUTHOR = "Daniel Muey <dmuey@cpan.org>"
HOMEPAGE = "https://metacpan.org/release/Hash-Merge"
SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0+"
LIC_FILES_CHKSUM = "file://README;md5=0d28824244d5c9e0d17ea7e56a29a976"

SRC_URI = "http://cpan.metacpan.org/authors/id/D/DM/DMUEY/Hash-Merge-${PV}.tar.gz"
SRC_URI[md5sum] = "875e2d9101bde2f6b410dd12f7e10964"
SRC_URI[sha256sum] = "1fa5de9d2d27adb8172b0b9429c1bdf16dc22c53305d47fac010f3dea86f071e"

S = "${WORKDIR}/Hash-Merge-${PV}"

inherit cpan

RDEPENDS_${PN} += "libclone-perl \
                   libtest-more-perl \
                   "

BBCLASSEXTEND = "native"
