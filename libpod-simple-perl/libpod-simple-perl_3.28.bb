SUMMARY = "Pod::Simple - framework for parsing Pod"
AUTHOR = "David E. Wheeler <david@justatheory.com>"
HOMEPAGE = "https://metacpan.org/module/Pod::Simple"
SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0+"
LIC_FILES_CHKSUM = "file://README;md5=8326aadb50aa81e8ff919499c1a6bb3a"

SRC_URI = "http://cpan.metacpan.org/authors/id/D/DW/DWHEELER/Pod-Simple-3.28.tar.gz"
SRC_URI[md5sum] = "ee65094e29924948ae02fe33229cc5e4"
SRC_URI[sha256sum] = "a95d37aa47118f6e036f965f195591bc2f3ffa369c76d575140a408e5578c4b1"

S = "${WORKDIR}/Pod-Simple-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
