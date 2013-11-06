SUMMARY = "JSON::XS - JSON serialising/deserialising, done correctly and fast"
AUTHOR = "Marc Lehmann <schmorp@schmorp.de>"
HOMEPAGE = "https://metacpan.org/module/JSON::XS"
SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0+"
LIC_FILES_CHKSUM = "file://COPYING;md5=043dba8b278e1db1b0ef93f30140b02b"

RPROVIDES_${PN} = "libjson-xs-perl \
                   libjson-xs-boolean-perl \
                  "

RDEPENDS_${PN} = "libcommon-sense-perl"

SRC_URI = "http://cpan.metacpan.org/authors/id/M/ML/MLEHMANN/JSON-XS-${PV}.tar.gz"
SRC_URI[md5sum] = "dda3c03335665cdeff91c37a269b833b"
SRC_URI[sha256sum] = "a62fdf2777b9ae206aef382dbb62c9a126ce2ceef0229edacee3f6a9c78900ea"

S = "${WORKDIR}/JSON-XS-${PV}"

inherit cpan

BBCLASSEXTEND = "native"

