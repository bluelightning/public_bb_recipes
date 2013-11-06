SUMMARY = "Net-HTTP provides modules in HTTP::X namespace for low-level connectivity"
AUTHOR = "Gisle Aas <gisle@activestate.net>"
HOMEPAGE = "https://metacpan.org/release/Net-HTTP"
SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0+"
LIC_FILES_CHKSUM = "file://README;md5=55e5ff78e6c9938dc315dc6d04c69feb"

SRC_URI = "http://cpan.metacpan.org/authors/id/G/GA/GAAS/Net-HTTP-${PV}.tar.gz"
SRC_URI[md5sum] = "6e74d76205f168775de68347266793a7"
SRC_URI[sha256sum] = "1d4e3ced899efad12431564d93abe73dd2a1224aa208af5f4ab829e7a2dd39d4"

S = "${WORKDIR}/Net-HTTP-${PV}"

inherit cpan

RDEPENDS_${PN} += "libcompress-raw-zlib-perl \
                   libio-compress-gzip-perl \
                   libio-select-perl \
                   libio-socket-inet-perl \
                   "

RPROVIDES_${PN} += "libnet-http-nb-perl \
                    libnet-https-perl \
                    libnet-http-methodss \
                    "

BBCLASSEXTEND = "native"
