SUMMARY = "Digest::SHA1 - Perl interface to the SHA-1 algorithm"
AUTHOR = "Gisle Aas <gisle@activestate.com>"
HOMEPAGE = "https://metacpan.org/module/Digest::SHA1"
SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0+"
LICENSE = "GPLv1+"
LIC_FILES_CHKSUM = "file://README;md5=2880954e370b62221b4546e663c39417"

SRC_URI = "http://cpan.metacpan.org/authors/id/G/GA/GAAS/Digest-SHA1-2.13.tar.gz"
SRC_URI[md5sum] = "bd22388f268434f2b24f64e28bf1aa35"
SRC_URI[sha256sum] = "68c1dac2187421f0eb7abf71452a06f190181b8fc4b28ededf5b90296fb943cc"

FILES_${PN} = "${PERLLIBDIRS}/auto/Digest/SHA1/* \
               ${PERLLIBDIRS}/Digest"

S = "${WORKDIR}/Digest-SHA1-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
