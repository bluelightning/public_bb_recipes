SUMMARY = "Provide https support for LWP::UserAgent "
AUTHOR = "Gisle Aas <gisle@activestate.com>"
HOMEPAGE = "https://metacpan.org/release/LWP-Protocol-https"
SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0+"
LIC_FILES_CHKSUM = "file://README;md5=564cc1a1c43004dbc60418dd36928962"

SRC_URI = "http://cpan.metacpan.org/authors/id/G/GA/GAAS/LWP-Protocol-https-${PV}.tar.gz"
SRC_URI[md5sum] = "1b422a7d3b5fed1eb4d748fdc9fd79a4"
SRC_URI[sha256sum] = "1ef67750ee363525cf729b59afde805ac4dc80eaf8d36ca01082a4d78a7af629"

S = "${WORKDIR}/LWP-Protocol-https-${PV}"

inherit cpan

RDEPENDS_${PN} += "libio-socket-ssl-perl \
                   liblwp-useragent-perl \
                   libmozilla-ca-perl \
                   libnet-https-perl \
                   "

RPROVIDES_${PN} += "liblwp-protocol-https-socket"

BBCLASSEXTEND = "native"
