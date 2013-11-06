SUMMARY = "Encoding and decoding of Base64 strings"
AUTHOR = "Gisle Aas <gisle@activestate.com>"
HOMEPAGE = "https://metacpan.org/release/MIME-Base64"
SECTION = "libs"
LICENSE = "GPLv1+"
LIC_FILES_CHKSUM = "file://README;md5=c8514b260866e0e8f75be6dd7cfbec15"

SRC_URI = "http://cpan.metacpan.org/authors/id/G/GA/GAAS/MIME-Base64-3.14.tar.gz"
SRC_URI[md5sum] = "66185dd11586d724245ba957db561e75"
SRC_URI[sha256sum] = "125a9427625477f90c8214d2ec80714c443c2d15ac390b7111fb1e19fb8d6ce1"

S = "${WORKDIR}/MIME-Base64-${PV}"

RPROVIDES_${PN} += 'libmime-base64-perl libmime-quotedprint-perl'

inherit cpan

BBCLASSEXTEND = "native"
