SUMMARY = "common::sense - save a tree AND a kitten, use common::sense!"
AUTHOR = "Marc Lehmann"
HOMEPAGE = "https://metacpan.org/module/common::sense"
SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0+"
LIC_FILES_CHKSUM = "file://LICENSE;md5=043dba8b278e1db1b0ef93f30140b02b"

SRC_URI = "http://cpan.metacpan.org/authors/id/M/ML/MLEHMANN/common-sense-${PV}.tar.gz"
SRC_URI[md5sum] = "9332e9fe85b0bce8c287a0429d164809"
SRC_URI[sha256sum] = "86e2c2e109a7dd4bc5441757e729d7d622da125c6e14607a78fb56e057b86b5a"

S = "${WORKDIR}/common-sense-${PV}"

inherit cpan

BBCLASSEXTEND = "native"

