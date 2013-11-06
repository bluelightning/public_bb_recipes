SUMMARY = "Class::Accessor - Automated accessor generation"
AUTHOR = "Marty Pauley <kasai@cpan.org>"
HOMEPAGE = "https://metacpan.org/module/Class::Accessor"
SECTION = "libs"
LICENSE = "GPL-1.0+"
LIC_FILES_CHKSUM = "file://README;md5=88d3bbcddb9eafb3ca9d3dbb54ee747d"

SRC_URI = "http://cpan.metacpan.org/authors/id/K/KA/KASEI/Class-Accessor-${PV}.tar.gz"
SRC_URI[md5sum] = "0d9640d237a13276145f7e44b4855b89"
SRC_URI[sha256sum] = "cdb1e0cdf8380fb9b63b44c33ce5afc1068736d55ac5904bf0eaa1efc1c3cefc"

S = "${WORKDIR}/Class-Accessor-${PV}"

inherit cpan

RPROVIDES_${PN} += "libclass-accessor-fast-perl \
                    libclass-accessor-faster-perl \
                    "

BBCLASSEXTEND = "native"
