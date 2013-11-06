SUMMARY = "HTTP::Negotiate - choose a variant to serve"
AUTHOR = "Gisle Aas <gisle@activestate.com>"
HOMEPAGE = "https://metacpan.org/module/HTTP::Negotiate"
SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0+"
LIC_FILES_CHKSUM = "file://README;md5=2d31997abdaa7d78be568195bdee00b6"

SRC_URI = "http://cpan.metacpan.org/authors/id/G/GA/GAAS/HTTP-Negotiate-6.01.tar.gz"
SRC_URI[md5sum] = "1236195250e264d7436e7bb02031671b"
SRC_URI[sha256sum] = "1c729c1ea63100e878405cda7d66f9adfd3ed4f1d6cacaca0ee9152df728e016"

S = "${WORKDIR}/HTTP-Negotiate-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
