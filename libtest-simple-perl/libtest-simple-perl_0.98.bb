SUMMARY = "Test::Builder - Backend for building test libraries"
AUTHOR = "Michael G. Schwern <mschwern@cpan.org>"
HOMEPAGE = "https://metacpan.org/module/Test::Builder"
SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0+"
LIC_FILES_CHKSUM = "file://README;md5=23e939b09e39c1a3069cf98c7f04500e"

RPROVIDES_${PN} += "libtest-builder-perl \
                    libbuilder-io-scalar-perl \
                    libbuilder-module-perl \
                    libtest-builder-tester-perl \
                    libbuilder-tester-color-perl \
                    libtest-more-perl \
                    libtest-simple-perl \
                    "

SRC_URI = "http://cpan.metacpan.org/authors/id/M/MS/MSCHWERN/Test-Simple-${PV}.tar.gz"
SRC_URI[md5sum] = "a8b26c97440269b33dd79fd847c521d8"
SRC_URI[sha256sum] = "2fb203e2cb75e72c6f70af71c6b01998f2c0ec2afba6c38cc5053c6107cd12a8"

S = "${WORKDIR}/Test-Simple-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
