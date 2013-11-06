SUMMARY = "Devel::StackTrace - Stack trace and stack trace frame objects"
AUTHOR = "Mark Jason Dominus <mjd@plover.com>"
HOMEPAGE = "https://metacpan.org/release/Devel-Trace"
SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0+"
LIC_FILES_CHKSUM = "file://README;md5=76538de3994fd1876f6e638394cb2b05"

SRC_URI = "http://cpan.metacpan.org/authors/id/M/MJ/MJD/Devel-Trace-${PV}.tar.gz"
SRC_URI[md5sum] = "6cea68e7e12f99cb94c7802346f15ab3"
SRC_URI[sha256sum] = "f501caf776ff7e986f76e02544d6ce234c89770173283f31df7dcc57800a3868"

S = "${WORKDIR}/Devel-Trace-${PV}"

inherit cpan

BBCLASSEXTEND = "native"

