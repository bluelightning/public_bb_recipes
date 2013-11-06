SUMMARY = "IO::Socket::INET6 - Object interface for AF_INET/AF_INET6 domain sockets"

AUTHOR = "Shlomi Fish <shlomif@shlomifish.org>"
HOMEPAGE = "https://metacpan.org/module/IO::Socket::INET6"
SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0+"
LIC_FILES_CHKSUM = "file://README;md5=6b09552b045c1af130c9ca1aafbd6580"

SRC_URI = "http://cpan.metacpan.org/authors/id/S/SH/SHLOMIF/IO-Socket-INET6-2.71.tar.gz"
SRC_URI[md5sum] = "cd40daacbdb90066205d6b581fafc775"
SRC_URI[sha256sum] = "344b6ceb5954023b7974fd93f83bc75125a84611c7ad716c3c734fdddcd83110"

S = "${WORKDIR}/IO-Socket-INET6-${PV}"

inherit cpan_build

BBCLASSEXTEND = "native"
