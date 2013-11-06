SUMMARY = "SSL sockets with IO::Socket interface "
AUTHOR = "Steffen Ullrich <steffen_ullrich@genua.de>"
HOMEPAGE = "https://metacpan.org/release/IO-Socket-SSL"
SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0+"
LIC_FILES_CHKSUM = "file://META.json;md5=7e6328e0e47e60a08e8597e953e464f4"

SRC_URI = "http://cpan.metacpan.org/authors/id/S/SU/SULLR/IO-Socket-SSL-${PV}.tar.gz"
SRC_URI[md5sum] = "00a0d03063dfd10ce25aed776d278dd3"
SRC_URI[sha256sum] = "0d3ee84c61cbd184d21db2fb21c0d9fca7b8bddfb03a58b03b28e186a5d8dc6a"

S = "${WORKDIR}/IO-Socket-SSL-${PV}"

inherit cpan

RDEPENDS_${PN} += "libnet-ssleay-perl \
                   perl-module-scalar-util \
                   "

RPROVIDES_${PN} += "libio-socket-ssl-intercept-perl \
                    libio-socket-ssl-utils-perl \
                    libio-socket-ssl-session_cache-perl \
                    libio-socket-ssl-ssl_context-perl \
                    libio-socket-ssl-ssl_handle-perl \
                    "

BBCLASSEXTEND = "native"
