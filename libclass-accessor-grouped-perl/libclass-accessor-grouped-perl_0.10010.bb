SUMMARY = "A tool for building groups of accessors"
AUTHOR = "Peter Rabbitson <ribasushi@cpan.org>"
HOMEPAGE = "https://metacpan.org/release/Class-Accessor-Grouped"
SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0+"
LIC_FILES_CHKSUM = "file://META.yml;md5=0be28a2fa0283acddf086b8d08be8365"

RDEPENDS_${PN} = "perl-module-carp \
                  perl-module-scalar-util \
                  libmodule-runtime-perl \
                 "

SRC_URI = "http://cpan.metacpan.org/authors/id/R/RI/RIBASUSHI/Class-Accessor-Grouped-${PV}.tar.gz"
SRC_URI[md5sum] = "c2416c6d68b9bda3a8cbe9daff3a140c"
SRC_URI[sha256sum] = "2162a23be6d8661cf0b67fdb413b8920534ec20f38ee00f6d47aeaa7a0938ec2"

S = "${WORKDIR}/Class-Accessor-Grouped-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
