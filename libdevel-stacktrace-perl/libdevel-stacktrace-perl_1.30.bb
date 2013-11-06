SUMMARY = "Devel::StackTrace - Stack trace and stack trace frame objects"
AUTHOR = "Dave Rolsky <autarch@urth.org>"
HOMEPAGE = "https://metacpan.org/module/Devel::StackTrace"
SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0+"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4f33fe2893b9c422c5c7b0158bc87142"

SRC_URI = "http://cpan.metacpan.org/authors/id/D/DR/DROLSKY/Devel-StackTrace-${PV}.tar.gz"
SRC_URI[md5sum] = "e318d2cb00c5bcba41c93f1e7280ab05"
SRC_URI[sha256sum] = "f4af79762263e477a65764ec9ff837e6e1c9f1f2c966c183036cd54bdee723d4"

PR = "r7"

S = "${WORKDIR}/Devel-StackTrace-${PV}"

inherit cpan

BBCLASSEXTEND="native"




