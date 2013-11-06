SUMMARY = "GPS::Point - Provides an object interface for a GPS point."
AUTHOR = "Michael R. Davis <mrdvt@cpan.org>"
HOMEPAGE = "https://metacpan.org/module/GPS::Point"
SECTION = "libs"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=468f02e236a1ed7d9aea03806f906a5b"

RDEPENDS_${PN} += 'perl-module-scalar-util libtest-number-delta-perl perl-module-test-simple'

SRC_URI = "http://cpan.metacpan.org/authors/id/M/MR/MRDVT/GPS-Point-0.20.tar.gz"
SRC_URI[md5sum] = "9f486722d6bfa17cc2144a3c3c4a9b9f"
SRC_URI[sha256sum] = "fee13168bdfc3e6b738ffce37cd1d187f00f24a29bd4d3ec2888e2c5a480a615"

S = "${WORKDIR}/GPS-Point-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
