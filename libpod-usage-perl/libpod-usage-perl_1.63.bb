SUMMARY = "Pod::Usage, pod2usage() - print a usage message from embedded pod documentation"
AUTHOR = "Marek Rouchal <marek.rouchal@gmx.net>"
HOMEPAGE = "https://metacpan.org/module/Pod::Usage"
SECTION = "libs"
LICENSE = "Artistic-1.0+ | GPL-1.0+"
LIC_FILES_CHKSUM = "file://README;md5=be78286431b3f2d1e52e4c9f2af54b19"

SRC_URI = "http://cpan.metacpan.org/authors/id/M/MA/MAREKR/Pod-Usage-1.63.tar.gz"
SRC_URI[md5sum] = "85b21c0150ec82c5e321a223766ca241"
SRC_URI[sha256sum] = "62d8bc7d4ce80799f3d3aaf1a636bec7bed75585ddef50fd197990ba6c4bb62c"

S = "${WORKDIR}/Pod-Usage-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
