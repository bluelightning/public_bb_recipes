SUMMARY = "File::Which Perl module from CPAN"
AUTHOR = "David Golden <kwilliams@cpan.org>"
HOMEPAGE = "http://github.com/Perl-Toolchain-Gang/File-Temp"
SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0+"
LIC_FILES_CHKSUM = "file://LICENSE;md5=385c55653886acac3821999a3ccd17b3"

SRC_URI = "http://cpan.metacpan.org/authors/id/A/AD/ADAMK/File-Which-1.09.tar.gz"
SRC_URI[md5sum] = "b9429edaad7f45caafa4d458afcfd8af"
SRC_URI[sha256sum] = "b72fec6590160737cba97293c094962adf4f7d44d9e68dde7062ecec13f4b2c3"

S = "${WORKDIR}/File-Which-${PV}"

inherit cpan

BBCLASSEXTEND = "native"


