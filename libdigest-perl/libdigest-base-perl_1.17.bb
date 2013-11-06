SUMMARY = "Digest::base - Digest base class"
AUTHOR = "Gisle Aas <gisle@activestate.com>"
HOMEPAGE = "https://metacpan.org/module/Digest::base"
SECTION = "libs"
LICENSE = "GPL-1.0+"
LIC_FILES_CHKSUM = "file://README;md5=582426500776cbdd06f026616efa666d"

SRC_URI = "http://cpan.metacpan.org/authors/id/G/GA/GAAS/Digest-${PV}.tar.gz"
SRC_URI[md5sum] = "2f8a38f7f6c1bd2df36feb16d8208d6d"
SRC_URI[sha256sum] = "2f6a54459fc7f37c0669d548bb224b695eb8d2ddc089aa5547645ce1f5fd86f7"

S = "${WORKDIR}/Digest-${PV}"

inherit cpan

RDEPENDS_${PN} += "libmime-base64-perl \
                   libtest-more-perl \
                   "

RPROVIDES_${PN} += "libdigest-file-perl"

BBCLASSEXTEND = "native"
