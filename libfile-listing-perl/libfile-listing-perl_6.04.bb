SUMMARY = "File::Listing - parse directory listing"
AUTHOR = "Gisle Aas <gisle@activestate.com>"
HOMEPAGE = "https://metacpan.org/module/File::Listing"
SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0+"
LIC_FILES_CHKSUM = "file://README;md5=b797097ead2abb910a9b40c0393742c3"

SRC_URI = "http://cpan.metacpan.org/authors/id/G/GA/GAAS/File-Listing-${PV}.tar.gz"
SRC_URI[md5sum] = "83f636b477741f3a014585bb9cc079a6"
SRC_URI[sha256sum] = "1e0050fcd6789a2179ec0db282bf1e90fb92be35d1171588bd9c47d52d959cf5"

RDEPENDS_${PN} += 'libhttp-date-perl'

RPROVIDES_${PN} += "libfile-listing-perl \
                    libfile-listing-apache-perl \
                    libfile-listing-dosftp-perl \
                    libfile-listing-netware-perl \
                    libfile-listing-unix-perl \
                    libfile-listing-vms-perl \
                    "

S = "${WORKDIR}/File-Listing-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
