SUMMARY = "Digest::SHA - Perl extension for SHA-1/224/256/384/512"
AUTHOR = "Gisle Aas <gisle@activestate.com>"
HOMEPAGE = "https://metacpan.org/module/Digest::SHA"
SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0+"
LIC_FILES_CHKSUM = "file://README;md5=0e0f4fa5d56c30753bffbf845b9e9f2e"

SRC_URI = "http://cpan.metacpan.org/authors/id/M/MS/MSHELOR/Digest-SHA-5.85.tar.gz"
SRC_URI[md5sum] = "7e9d19d00a66363012a6fdb3ae3ffd22"
SRC_URI[sha256sum] = "57eaa26fb2d2ccfd31af2fd312992272439d561c17e34274e8c7aa93e427ca49"

EXTRA_CPANFLAGS = "EXPATLIBPATH=${STAGING_LIBDIR} EXPATINCPATH=${STAGING_INCDIR}"

S = "${WORKDIR}/Digest-SHA-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
