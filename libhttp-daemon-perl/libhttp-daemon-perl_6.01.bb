SUMMARY = "HTTP::Daemon - a simple http server class"
AUTHOR = "Gisle Aas <gisle@activestate.com>"
HOMEPAGE = "https://metacpan.org/module/HTTP::Daemon"
SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0+"
LIC_FILES_CHKSUM = "file://README;md5=f40489294d9173e32966a6dda330bb2f"

SRC_URI = "http://cpan.metacpan.org/authors/id/G/GA/GAAS/HTTP-Daemon-6.01.tar.gz"
SRC_URI[md5sum] = "ed0ae02d25d7f1e89456d4d69732adc2"
SRC_URI[sha256sum] = "43fd867742701a3f9fcc7bd59838ab72c6490c0ebaf66901068ec6997514adc2"

RDEPENDS_${PN} += "libhttp-date-perl \
                   libhttp-request-perl \
                   libhttp-response-perl \
                   libhttp-status-perl \
                   libio-socket-perl \
                   liblwp-mediatypes-perl \
                   "
                   
S = "${WORKDIR}/HTTP-Daemon-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
