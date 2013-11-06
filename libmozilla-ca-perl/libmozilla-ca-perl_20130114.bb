SUMMARY = "Mozilla's CA cert bundle in PEM format"
AUTHOR = "Ask Bjørn Hansen <ask@perl.org>"
HOMEPAGE = "https://metacpan.org/release/Mozilla-CA"
SECTION = "libs"
LICENSE = "GPL-2.0+ | LGPL-2.1+"
LIC_FILES_CHKSUM = "file://README;md5=f6472f5dd4a65bfcc8bf6f9a9d71452e"

SRC_URI = "http://cpan.metacpan.org/authors/id/A/AB/ABH/Mozilla-CA-${PV}.tar.gz"
SRC_URI[md5sum] = "45a42082dbd68cf25869ceb2aa49d5b2"
SRC_URI[sha256sum] = "82342614add1dbca8a00daa1ee55af3e0036245aed7d445537918c045008ccd7"

S = "${WORKDIR}/Mozilla-CA-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
